package euchre.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import euchre.player.GameManager;


/**
 * A thread to manage the client's network connection. A socket is created to the server, and hangs the thread
 * waiting for input. Any received input is then passed to the EuchreProtocol, which will take the appropriate
 * action based on the formatted string.
 * 
 * @author mdhelgen
 *
 */
public class ClientNetworkManager extends Thread{ // extends NetworkManager {   abstract this out later

	Socket clientSocket = null;
	PrintWriter out = null;
	BufferedReader in;
	EuchreProtocol protocol;
	GameManager manager;

	String hostname;
	int port = 4444;
	boolean connecting = true;
	boolean running = true;
	String inputLine;

	/**
	 * Create a ClientNetworkManager to connect to localhost.
	 * 
	 */
	public ClientNetworkManager(){

		hostname = "localhost";
		protocol = new EuchreProtocol();

	}

	/**
	 * Create a ClientNetworkManager to connect to the specified hostname.
	 *  
	 * @param hostname The hostname of the server to connect to.
	 */
	public ClientNetworkManager(String hostname){

		this.hostname = hostname;
		protocol = new EuchreProtocol();
	}

	/**
	 * Register a player with the server
	 * This will create a player object with the server and associate its connection to the player id.
	 * 
	 * @param name The name of the player
	 * @param id The random id of the player
	 */
	public void registerPlayer(String name, int id){

		toServer("Name,"+name+","+id);
	}

	/**
	 * Send a tokenized message to the server. 
	 * 
	 * @param tokenizedString A comma delimited message to be interpreted by EuchreProtocol by the server
	 */
	public void toServer(String tokenizedString){

		out.println(tokenizedString);
	}

	/**
	 * Set reference to game manager
	 * 
	 * @param gm The game manager
	 */
	public void setGameManager(GameManager gm){
		manager = gm;
		protocol.setGameManager(gm);
	}
	
	/**
	 * Get reference to game manager
	 * 
	 * @return The game manager
	 */
	public GameManager getGameManager(){
		return manager;
	}

	/**
	 * The thread's actions. Make a socket connection to the server and process any input
	 * 
	 */
	public void run(){

		//run this loop continually
		while(true){

			if(connecting){


				//create the new socket connection
				try {
					clientSocket = new Socket(hostname, port);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					System.out.println("Unknown Host:" + hostname);
					running = false;
					//e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("Connection refused");
					running = false;
					break;
				}

				//get reference to the output stream
				try {
					out = new PrintWriter(clientSocket.getOutputStream(), true);
					in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("connected to server");

				//send a message to the server
				//out.println("CLIENT");
				connecting = false;

			}
			if(running){
				try {
					while((inputLine = in.readLine()) != null){

						//output the message
						System.out.println("Message from server:");
						protocol.clientParse(inputLine);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}	
	}
}
