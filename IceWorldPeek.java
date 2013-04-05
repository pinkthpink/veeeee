import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.ArrayList;
//import org.json.simple.*;
//import org.json.simple.parser.*;

public class IceWorldPeek extends Thread{
	//JSONParser parser = new JSONParser();
	public static Operation op = new Operation(null);
	public static void main(String args[]) throws IOException, InterruptedException{
		System.out.println("\nUser Manual");
		System.out.println("\n----------------------------------\n");
		System.out.println("time\t\t\t: return time of the IceWorld");
		System.out.println("states\t\t\t: return states of the ICEWorld");
		System.out.println("actions s\t\t: return actions of 's'");
		System.out.println("gresources s\t\t: return gresources of 's'");
		System.out.println("gurl s\t\t\t: return gurl of 's'");
		System.out.println("\n----------------------------------\n");
		op.start();
		/*
		while (true){
			System.out.print(".");
		}
		*/
		/*
		JFrame detector = new JFrame();
		detector.setVisible(true);
		detector.addKeyListener(new KeyAdapter(){
			//public void keyPressed(KeyEvent ke, ActionEvent at){
			public void keyPressed(KeyEvent ke){
				int key = ke.getKeyCode();
				*/
				/*
				int act = at.getModifiers();
				if(key == KeyEvent.VK_Z && act == ActionEvent.CTRL_MASK){
					System.out.println("escape pressed on about");
				}
				*/
		/*
				if(key == KeyEvent.VK_X){
					System.out.println("Operation Terminated");
				}
			}
		});
		*/
		/*
		detector.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent ke) {
				int key = ke.getKeyCode();
				if(key == KeyEvent.VK_ESCAPE){
					//System.out.println("escape pressed on about");
					customization.setVisible(false);
					customization.dispose();
				}
			}
		});
		*/
		/*
		helpItem.setMnemonic(KeyEvent.VK_F1);
		helpItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,0));
		helpItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});
		*/
		//String output;
		/*
		while(true){
			String server = "iceworld.sls-atl.com";
			System.out.println("Checking server...");
			if(isReachable(server)){
				System.out.println("Server online");
				System.out.print("Input HTTP Request here : ");
				
				BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
				cmd = userInput.readLine();
				op = new Operation(cmd);
				//opIsNotWorking = false;
				op.start();
				//sleep(1);
			} else {
				System.out.println("Server is down");
			}
		}
		*/
			//System.out.print(ProcessReq(cmd));
			//URL yahoo = new URL("http://www.yahoo.com/");
			/*
			URL a = new URL("http://iceworld.sls-atl.com/api/&cmd="+cmd);
	        URLConnection yc = a.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) {}
	            //System.out.println(inputLine);
	        in.close();
			/*
			output = ProcessReq(HTTPRequest());
			System.out.println(output);
			*/
	        //System.out.print(inputLine);
	}
	/*
	public static boolean isReachable(String address) {
		Socket socket = null;
		boolean reachable = false;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(address, 80), 1000);
			reachable = true;
		}
		catch (Exception e) {
			//System.out.println(e);
		}
		finally {
			if (socket != null)
				try {
					socket.close();
				}
			catch (IOException e) {}
		}
    return reachable;
	}
	*/
	/*
	public static String ProcessReq(String req) throws IOException{
		String result = "";
		if(req.equalsIgnoreCase("time") || req.equalsIgnoreCase("times")){
			//send time request to iceworld api
			URL a = new URL("http://iceworld.sls-atl.com/api/&cmd="+req);
	        URLConnection yc = a.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;
	        
	        while ((inputLine = in.readLine()) != null) {
	            //System.out.println(inputLine);
	            result += inputLine;
	        }
	        in.close();
		} else if(req.equalsIgnoreCase("state") || req.equalsIgnoreCase("states")){
			
		}
		//String inputLine;
		return result;
	}
	public static String ProcessReq(String req, String req2){
		if(req.equalsIgnoreCase("time") || req.equalsIgnoreCase("times")){
			//send time request to iceworld api
		} else if(req.equalsIgnoreCase("state") || req.equalsIgnoreCase("states")){
			
		}
		return req;
	}
	public static String ProcessReq(String req, String req2, String req3){
		if(req.equalsIgnoreCase("time") || req.equalsIgnoreCase("times")){
			//send time request to iceworld api
		} else if(req.equalsIgnoreCase("state") || req.equalsIgnoreCase("states")){
			
		}
		return req;
	}
	public static String HTTPRequest() throws IOException{
		String result;
		BufferedReader HTTP = new BufferedReader(new InputStreamReader(System.in));
		result = HTTP.readLine();
		return result;
	}
	*/
}
class Operation extends Thread{
	public static Operation op = new Operation(null);
	public static String cmd;
	String c = "";
	public Operation(String cmd) {
		c=cmd;
	}
	public void run(){
		String input="";
		String result ="";
		String server = "iceworld.sls-atl.com";
		try{
			while(true){
				System.out.println("Checking server...");
				if(isReachable(server)){
					System.out.println("Server online");
					System.out.print("Input HTTP Request here : ");
					BufferedReader HTTP = new BufferedReader(new InputStreamReader(System.in));
					input = HTTP.readLine();
					result = "\n"+ProcessReq(input)+"\n";
					System.out.print(result);
					//BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
					//cmd = userInput.readLine();
					//sleep(2000);
					//System.out.print(cmd);
				} else {
					System.out.println("Server is down");
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public boolean isReachable(String address) {
		Socket socket = null;
		boolean reachable = false;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(address, 80), 1000);
			reachable = true;
		}
		catch (Exception e) {
		}
		finally {
			if (socket != null)
				try {
					socket.close();
				}
			catch (IOException e) {}
		}
    return reachable;
	}
	public String ProcessReq(String req) throws MalformedURLException, IOException{
		
		String result = "";
		
		if (req.indexOf(' ') == -1){
			URL a = new URL("http://iceworld.sls-atl.com/api/&cmd="+req);
	        URLConnection yc = a.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;
	        
	        while ((inputLine = in.readLine()) != null) {
	            result += inputLine+"\n";
	        }
	        in.close();
			/*
			if(req.equalsIgnoreCase("time") || req.equalsIgnoreCase("times")){
				URL a = new URL("http://iceworld.sls-atl.com/api/&cmd="+req);
		        URLConnection yc = a.openConnection();
		        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		        String inputLine;
		        
		        while ((inputLine = in.readLine()) != null) {
		            result += inputLine;
		        }
		        in.close();
			} else if(req.equalsIgnoreCase("state") || req.equalsIgnoreCase("states")){
				System.out.print("lol");
			}
			*/
		}else{
			result = ProcessReq(req.substring(0,req.indexOf(' ')),req.substring(req.indexOf(' ')+1,req.length()));
		}
		
		return result;
	}
	public String ProcessReq(String req1, String req2) throws MalformedURLException, IOException{
		String result="";
		String s = "";
		if(req1.equalsIgnoreCase("actions")){
			s=req1+"&from="+req2;
		} else if(req1.equalsIgnoreCase("gresources")){
			s=req1+"&uid="+req2;
		} else if(req1.equalsIgnoreCase("gurl")){
			s=req1+"&gid="+req2;
		}
		
		URL a = new URL("http://iceworld.sls-atl.com/api/&cmd="+s);
        URLConnection yc = a.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null) {
            result += inputLine+"\n";
        }
        in.close();
		
		return result;
	}
	/*
	public String ProcessReq(String req, String req2, String req3){
		if(req.equalsIgnoreCase("time") || req.equalsIgnoreCase("times")){
			//send time request to iceworld api
		} else if(req.equalsIgnoreCase("state") || req.equalsIgnoreCase("states")){
			
		}
		return req;
	}
	*/
	/*
	public String HTTPRequest() throws IOException{
		String input;
		BufferedReader HTTP = new BufferedReader(new InputStreamReader(System.in));
		input = HTTP.readLine();
		//System.out.println();
		return input;
	}
	*/
}