
/*
 * Represents an n by n matrix
 */

class Matrix
{
	// Size of the matrix
	private int m, n;
	// Matrix data - stored as a 
	private int data[];
	
	/*
	 * Constructor that initializes the members and creates an array of double
	 */
	public Matrix(int m, int n)
	{
		this.m = m;
		this.n = n;
		data = new int[m*n];
	}
	
	/*
	 * Returns the number of rows in the matrix
	 */
	public int getNRows()
	{
		return m;
	}
	
	/*
	 * Returns the number of columns in the matrix
	 */
	public int getNColumns()
	{
		return n;
	}
	
	/*
	 * Get the size of the matrix. It is returned as an array of two integers
	 * of size m by n
	 */
	public int[] getSize()
	{
		int[] matrix_size = new int[2];
		matrix_size[0] = m;
		matrix_size[1] = n;
		return matrix_size;
	}
	
	/*
	 * Check that the parameters are inside the matrix dimensions
	 */
	private void checkParameters(int i, int j)
	{

		if ( (i < 0) || (j< 0) || (i >= m) || (j >= n) )
		{
			throw new IllegalArgumentException("Values exceed matrix dimensions");
		}
	}
	
	/*
	 * Getter and setter for data in the matrix
	 */
	public int getMatrixValue(int i, int j)
	{
		// Make sure that the value is in the matrix before sending
		// the value
		checkParameters(i, j);
		
		// Get the data and return the data
		return data[i*n + j];
	}
	
	/*
	 * Set the value for the matrix
	 */
	public void setMatrixValue(int i, int j, int value)
	{
		// Make sure that the value is in the matrix before sending
		// the value
		checkParameters(i, j);
		
		data[i*n + j] = value;
	}
	
	/*
	 * For printing out the matrix
	 */
	public String toString()
	{
		String s = "";
		for (int i=0; i<n; i++)
		{
			s += "[";
			for (int j=0; j<m; j++)
			{
				s += Integer.toString(data[i*n+j]) + " ";
			}
			s += "]\n";
		}
		return s;
	}
}
