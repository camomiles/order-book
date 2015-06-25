// Import File object to work with xml file
import java.io.File;

// Import Document object interface to store parsed file
import org.w3c.dom.Document;

// Import xml parser
import javax.xml.parsers.*;

// Import list data-structure
import java.util.List;
import java.util.LinkedList;

// Import Map data-structure
import java.util.Map;
import java.util.HashMap;

class orderBook {
	// Configure xml file name or path
	private static String xmlFileName = "orders.xml";

	public static void main (String[] args) {
		// Be nice and say hello
		log("Hello!");

		// Parse xml file
		loadXML(xmlFileName);

		// Create new Map structure to store lists
		Map listMap = new HashMap();

		// Create new list instance
		List transactionList = new LinkedList();

		// Check empty map length
		log("Map length before population: " + listMap.size());

		// Check empty list length
		log("List length before population: " + transactionList.size());

		// Create 5 new transactions and add them to the list
		for (int i = 1; i < 6; i++) {
			// Create new instance of Transaction
			Transaction newTransaction = new Transaction(i);

			// Add properties to the Transaction

			// Set volume
			newTransaction.setVolume(100*i);

			// Set price
			newTransaction.setPrice(300.12*i);

			// Set operartion type
			newTransaction.setOperationType("SELL");

			// Show transaction info in the console
			log("Transaction orderID: " + newTransaction.orderID + "\n");

			log("Transaction operation: " + newTransaction.getOperationType() + "\n");

			log("Transaction volume: " + newTransaction.getVolume() + "\n");

			log("Transaction price: " + newTransaction.getPrice() + "$\n");

			System.out.print("\n\n");


			// Add transation to the list of orders
			transactionList.add(newTransaction);
		}

		// Check populated list length
		log("List length after population: " + transactionList.size());

		// Add new list to the map structure with key 'book'
		listMap.put("book", transactionList);

		// Check empty map length
		log("Map length after population: " + listMap.size());
		
		// Check that map returns list by its key
		List returnList = (List) listMap.get("book");

		log("Size of the List returned by map for 'book' key: " + returnList.size());

	}

	// Function that logs string to the console
	private static void log(String string) {
		System.out.println(string);
	}

	// Function that takes a filepath string and returns parsed xml file
	private static void loadXML(String filepath) {
		File xmlFile;
		// Load file object into memory
		try {
			xmlFile = new File(filepath);

			// Check that file exists and is not a directory
			if (xmlFile.exists() && xmlFile.isFile()) {
				// Log loaded file info
				log("\n-- XML file was loaded succesfully --");
				log("File name: " + xmlFile.getName());
				log("Can read: " + xmlFile.canRead());
				log("Can write: " + xmlFile.canWrite());
				log("Can execute: " + xmlFile.canExecute());
				log("-- \n");

				// Parse file after it is loaded
				parseXML(xmlFile);

			} else {
				throw new Error("XML file does not exist at the given path");
			}

		} catch (NullPointerException e) {
			// If xmlFileName is null - show error
			log("Error: XML file name should not be null.");
		}
	}

	// This function takes in plain File object and parses it into xml Document object
	private static void parseXML(File xmlFile) {

		// Create new instance of DocumentBuilderFactory to create parser for xml
		DocumentBuilderFactory parserBuilder = DocumentBuilderFactory.newInstance();

		// Create an instance of Document builder to parse input file
		try {
			DocumentBuilder parser = parserBuilder.newDocumentBuilder();

			// Parse File into Document
			try {
				Document parsedXml = parser.parse(xmlFile);

				log("\n-- XML file was parsed successfully --");
				log("XML Version: " + parsedXml.getXmlVersion());
				log("XML Encoding: " + parsedXml.getXmlEncoding());
				log("--\n");
			} catch (Exception e) {
				log("Error: Failed to parse XML file.");
			}

		} catch (ParserConfigurationException e) {
			log("Error: Failed to setup XML parser.");
		}

	}

	static class Transaction { 
		// Store orderID
		public Integer orderID;
		// Store amount of books in that order
		private Integer volume;
		// Store book price
		private Double price;
		// Store operation type
		private String operationType;

		// Class constructior
		public Transaction (Integer orderID) {
			// Assign recieved orderID to the order
			this.orderID = orderID;
		}

		// Create property setters
		public void setVolume(Integer volume) { this.volume = volume; }

		public void setPrice(Double price) { this.price = price; }

		public void setOperationType(String operation) { this.operationType = operation; }


		// Create property getters
		public Integer getVolume() { return this.volume; }

		public Double getPrice() { return this.price; }

		public String getOperationType() { return this.operationType; }
	}
}

