package jessicaAndTheDoubleDs;

import java.util.ArrayList;
import java.util.Scanner;
// import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class SearchLogic{
	
	public static void doSearch()
	{
		Scanner searchTerms = new Scanner(( GUI.txtSearchTerms).getText());
	
		StringBuilder sbResults = new StringBuilder();
		sbResults.append( "You searched for:\r\n \r\n" );
		
		ArrayList<String> searchTerm = new ArrayList<>();
	
		// While there are still search terms...
		while(searchTerms.hasNext()) 
		{
			searchTerm.add( searchTerms.next() );
		} // While
		
		for (int i = 0; i < searchTerm.size(); ++i )
		{
			sbResults.append( searchTerm.get( i ) + " " ); 
	
			// If OR and not last search term
			if ( GUI.orBtnSelected && ( i < ( searchTerm.size() - 1 ) ) )
				sbResults.append( "OR " );
					
			// If AND and not last search term
			if ( GUI.andBtnSelected && ( i < ( searchTerm.size() - 1 ) ) )
				sbResults.append( "AND " );
					
			// If PHRASE and last search term
			if ( GUI.phraseBtnSelected && !( i < ( searchTerm.size() - 1 ) ) )
				sbResults.append( "(PHRASE; terms in this order) " );
		}
		sbResults.append( "\r\n\r\n" );
	
		// Write string to results text area
	//	GUI.txtResults.setText( sbResults.toString() );
	
		// Close scanner
		searchTerms.close();
		
		boolean noResultsFound = true;
		int word;
	
		if ( GUI.orBtnSelected )
		{
		// OR search:
		for (int term = 0; term < searchTerm.size(); ++term)
		{
			word = -1;
			for (int fileNum = 0; fileNum < Index.numFiles; ++fileNum)
			{
				for (int posn = 0; posn < Index.wordCount.get( fileNum ); ++ posn)
				{
					++ word;
					if ( Index.wordIndex.get( word ).equals( searchTerm.get( term ) ) )
					{
						noResultsFound = false;
						sbResults.append( searchTerm.get( term ) + " was found in file " + Index.fileNames.get( fileNum ) + " at position " + posn + "\r\n");
					}
				}
			}
		}
		}
		else if ( GUI.andBtnSelected )
		{
		// AND search:
		int wordLow = 0;
		boolean termFound;
		boolean allTermsFound = true;
		for (int fileNum = 0; fileNum < Index.numFiles; ++fileNum)
		{
			allTermsFound = true;
			for (int term = 0; term < searchTerm.size(); ++term)
			{
				termFound = false;
				word = wordLow - 1;
				for (int posn = 0; posn < Index.wordCount.get( fileNum ); ++ posn)
				{
					++ word;
					if ( Index.wordIndex.get( word ).equals( searchTerm.get( term ) ) )
					{
						termFound = true;
					}
				} // for posn
				if ( !termFound )
				{
					allTermsFound = false;
				}
			} // for term
			wordLow += Index.wordCount.get( fileNum );
			if ( allTermsFound )
			{
				sbResults.append( "All search terms were found in file " + Index.fileNames.get( fileNum ) + "\r\n");
				noResultsFound = false;
			}
		} // for fileNum
		}
	
		if ( noResultsFound )
		{
			sbResults.append( "No results found." );
		}
		
		GUI.txtResults.setText( sbResults.toString() );
} // doSearch
} // Class SearchLogic


