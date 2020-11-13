package sanjay_cucumber.Actions;

import java.util.List;

public class HandleDataTables {
	
	public static void passDataTableValues(io.cucumber.datatable.DataTable dataTable, int rowNumber, int columnNumber) {
		
		//this is a very important step
		//*************************************
		List<List<String>> obj = dataTable.asLists();
		//*************************************
		System.out.print(obj.get(rowNumber).get(columnNumber) + " ");
		System.out.println();
		//System.out.println(obj.get(1).get(1).toUpperCase());
			
		
	}

}
