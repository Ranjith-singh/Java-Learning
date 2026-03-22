package recurssion;

import java.util.*;

public class r13 {
	
	public static boolean isSafe(int row,int col,char [][] board)
	{
		//vertical check
		for(int r=0;r<board.length;r++)
		{
			if(board[r][col]=='Q')
			{
				return false;
			}
		}
		//horizontal check
		for(int c=0;c<board[0].length;c++)
		{
			if(board[row][c]=='Q')
			{
				return false;
			}
		}
		for(int r=row,c=col;r>=0 && c>=0;r--,c--)
		{
			if(board[r][c]=='Q')
			{
				return false;
			}
		}
		for(int r=row,c=col;r>=0 && c<board[0].length;r--,c++)
		{
			if(board[r][c]=='Q')
			{
				return false;
			}
		}
		for(int r=row,c=col;r<board.length && c<board[0].length;r++,c++)
		{
			if(board[r][c]=='Q')
			{
				return false;
			}
		}
		for(int r=row,c=col;r<board.length && c>=0;r++,c--)
		{
			if(board[r][c]=='Q')
			{
				return false;
			}
		}
		return true;
	}
	
	public static void saveBoard(List<List<String>> allboard,char [][] board)
	{
		List<String> newboard=new ArrayList<>();
		for(int i=0;i<board.length;i++)
		{
			String row="";
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]=='Q')
				{
					row+='Q';
				}
				else
				{
					row+='.';
				}
			}
			newboard.add(row);
		}
		allboard.add(newboard);
	}
	
	public static void helper(char [][] board,List<List<String>> allboard,int col)
	{
		if(col==board[0].length)
		{
			saveBoard(allboard,board);
			return;
		}
		for(int row=0;row<board.length;row++)
		{
			if(isSafe(row,col,board))
			{
				board[row][col]='Q';
				helper(board,allboard,col+1);
				board[row][col]='.';
			}
		}
	}
	
	public static List<List<String>> solvequeens(int n)
	{
		List<List<String>> allboard=new ArrayList<>();
		char [][] board=new char[n][n];
		helper(board,allboard,0);
		return allboard;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<solvequeens(n).size();i++)
		{
			System.out.println(solvequeens(n).get(i));
		}
	}
}
