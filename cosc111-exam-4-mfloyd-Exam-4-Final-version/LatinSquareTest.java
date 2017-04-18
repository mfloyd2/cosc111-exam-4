import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
public class LatinSquareTest
{	
	/*
	 * Find in row of matrix Test4
	 */
	@Test
	public void FindInRowsTest() throws IOException
	{
		LatinSquare ls = new LatinSquare("Test4.txt");
		assertEquals(ls.findInRow(0, 1), 0);
		assertEquals(ls.findInRow(0, 2), 1);
		assertEquals(ls.findInRow(0, 3), 2);
		assertEquals(ls.findInRow(0, 4), -1);
		assertEquals(ls.findInRow(2, 1), 1);
		assertEquals(ls.findInRow(2, 2), 0);
		assertEquals(ls.findInRow(2, 3), 2);
		assertEquals(ls.findInRow(2, 4), -1);
	}
	
	/*
	 * Find in column of matrix Test4
	 */
	@Test
	public void FindInColumnsTest() throws IOException
	{
		LatinSquare ls = new LatinSquare("Test4.txt");
		assertEquals(ls.findInColumn(0, 1), 0);
		assertEquals(ls.findInColumn(0, 2), 2);
		assertEquals(ls.findInColumn(0, 3), -1);
		assertEquals(ls.findInColumn(2, 1), -1);
		assertEquals(ls.findInColumn(2, 2), 1);
		assertEquals(ls.findInColumn(2, 3), 0);
	}
	
	/*
	 * Test0 is valid Latin square. Check all the columns and rows and
	 * that the matrix itself is a Latin square.
	 */
	@Test
	public void LatinTest0() throws IOException 
	{
		LatinSquare ls = new LatinSquare("Test0.txt");
		assertTrue(ls.isRowLatin(0));
		assertTrue(ls.isRowLatin(1));
		assertTrue(ls.isColumnLatin(0));
		assertTrue(ls.isColumnLatin(1));
		assertTrue(ls.isLatin());
	}
	
	/*
	 * Test1 is not a valid Latin square. Check that all the rows and columns
	 * come back as invalid
	 */
	@Test
	public void LatinTest1() throws IOException
	{
		LatinSquare ls = new LatinSquare("Test1.txt");
		assertFalse(ls.isRowLatin(0));
		assertFalse(ls.isRowLatin(1));
		assertFalse(ls.isRowLatin(2));
		assertFalse(ls.isColumnLatin(0));
		assertFalse(ls.isColumnLatin(1));
		assertFalse(ls.isColumnLatin(2));
		assertFalse(ls.isLatin());
	}

	/*
	 * Test2 is a valid Latin square.
	 */
	@Test
	public void LatinTest2() throws IOException
	{
		LatinSquare ls = new LatinSquare("Test2.txt");
		assertTrue(ls.isRowLatin(0));
		assertTrue(ls.isRowLatin(1));
		assertTrue(ls.isRowLatin(2));
		assertTrue(ls.isColumnLatin(0));
		assertTrue(ls.isColumnLatin(1));
		assertTrue(ls.isColumnLatin(2));
		assertTrue(ls.isLatin());
	}
	
	/*
	 * Test4 is a not valid Latin square but the rows
	 * are valid, and one column is valid.
	 */
	@Test
	public void LatinTest4() throws IOException
	{
		LatinSquare ls = new LatinSquare("Test4.txt");
		assertTrue(ls.isRowLatin(0));
		assertTrue(ls.isRowLatin(1));
		assertTrue(ls.isRowLatin(2));
		assertFalse(ls.isColumnLatin(0));
		assertTrue(ls.isColumnLatin(1));
		assertFalse(ls.isColumnLatin(2));
		assertFalse(ls.isLatin());
	}
}
