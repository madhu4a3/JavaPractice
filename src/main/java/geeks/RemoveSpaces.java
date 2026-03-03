package geeks;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Hello Geeks        . Welcome to   GeeksforGeeks . ";

		new RemoveSpaces().removeSpaces(str);



	}



//Function to in-place trim all spaces in the
//string such that all words should contain only
//a single space between them.
void removeSpaces(String st)
{
	// n is length of the original string
	int n = st.length();
	char[] str = st.toCharArray();
	// i points to next postion to be filled in
	// output string/ j points to next character
	// in the original string
	int i = 0, j = 0;

	// flag that sets to true is space is found
	boolean spaceFound = false;

	// Handles leading spaces
	/*while (++j < n && str[j] == ' ');*/
	for(;j<n && str[j] == ' ';j++);

	// read all characters of original string
	while (j < n)
	{
		// if current characters is non-space
		if (str[j] != ' ')
		{
			// remove preceding spaces before dot,
			// comma & question mark
			if ((str[j] == '.' || str[j] == ',' ||
				str[j] == '?') && i - 1 >= 0 &&
				str[i - 1] == ' ')
				str[i - 1] = str[j++];

			else
				// copy current character at index i
				// and increment both i and j
				str[i++] = str[j++];

			// set space flag to false when any
			// non-space character is found
			spaceFound = false;
		}
		// if current character is a space
		else if (str[j++] == ' ')
		{
			// If space is encountered for the first
			// time after a word, put one space in the
			// output and set space flag to true
			if (!spaceFound)
			{
				str[i++] = ' ';
				spaceFound = true;
			}
		}
	}

	while(i<n){
		System.out.printf("i is %d\n", i);
		str[i] = 0;
		i++;
	}
	
	// Remove trailing spaces
	System.out.println("new string: "+new String(str));
}
}

