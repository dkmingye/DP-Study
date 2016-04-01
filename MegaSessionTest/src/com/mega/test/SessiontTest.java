package com.mega.test;

import com.mega.modeling.api.*;

public class SessiontTest {

	static MegaApplication oMegaApp = null;
	static MegaEnvironment oEnvironement=null;
	static MegaTransaction oTransaction = null;
	static MegaDatabase oDatabase = null; 
	static MegaTransactions cTransactions =null;
	final static String environmentName="mytest2";
	final static String repositoryName="mytest2";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		oMegaApp=new MegaApplication();		
		oMegaApp.toolkit().setInteractiveMode("Batch");
		MegaEnvironments cEnvironments = oMegaApp.getEnvironments();		
		if (oMegaApp == null || oMegaApp.isEmpty()) {
			
			System.out.println("failed");			
		} else {
			System.out.println("connected appxx");
			
		}
		System.out.println("rererer");
	////choose a environment//////	
	if (cEnvironments == null || cEnvironments.isEmpty()) {
			
			System.out.println("envrionment failed");			
		} else {
			System.out.println("connected environments, have number : "+cEnvironments.size());		
			for (int i=1;i<=cEnvironments.size();i++){
				if(cEnvironments.get(i).getName().contains(environmentName)){
					oEnvironement=cEnvironments.get(i);
				}
				System.out.println(cEnvironments.get(i).getName());
			}
			    System.out.println("Environment selected is "+oEnvironement.getName());
		
		}
	
	     MegaUsers cUsers = oEnvironement.users();
	     //// all the users in environment
	     for(int j=1;j<=cUsers.size();j++){	    	 
	    	 System.out.print(" : " + cUsers.get(j).getName());	    	 
	     }
	     //set user for the environment
	     oEnvironement.setCurrentAdministrator("Mega");
	     oEnvironement.setCurrentPassword("");
	     System.out.print("\n current user in environment : " +  oEnvironement.getCurrentAdministrator());	
	     
	     //set transaction 
	     cTransactions = oEnvironement.transactions();
	         // (repository name , megauser)
	     oTransaction = cTransactions.create(repositoryName, "Mega");
		 cTransactions.release();
		 oTransaction.setPassword("");
		 
		 // get root object
		 oDatabase = getDatabaseObject(oEnvironement,repositoryName);
		 if (oDatabase  == null) {
			 System.out.println("database does not exist");
			}
		 
		 MegaRoot oRoot = oDatabase.open();
		 MegaCurrentEnvironment oCurrentEnvironment = oRoot.currentEnvironment();
		 MegaObject test_obj=oRoot.getCollection("Business Process").get(1);
		 
		 System.out.println(test_obj.megaField());
	
	}
	
	private static MegaDatabase getDatabaseObject(MegaEnvironment oEnvironment, String databaseName) {
		MegaDatabases cDatabases = oEnvironment.databases();
		final MegaDatabase retVal = cDatabases.get(databaseName);
		cDatabases.release();
		return retVal;
	}
	
	

}
