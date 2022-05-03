package assignment2;

class MonthName
{

    // Function to return the word
// of the corresponding digit
    static void printValue(int digit)
    {

        // Switch block to check for each digit c
        switch (digit)
        {

            // For digit 0
            case '1':
                System.out.print("Jan ");
                break;

            // For digit 1
            case '2':
                System.out.print("Feb");
                break;

            // For digit 2
            case '3':
                System.out.print("March ");
                break;

            // For digit 3
            case '4':
                System.out.print("April ");
                break;

            // For digit 4
            case '5':
                System.out.print("May ");
                break;

            // For digit 5
            case '6':
                System.out.print("June ");
                break;

            // For digit 6
            case '7':
                System.out.print("July ");
                break;

            // For digit 7
            case '8':
                System.out.print("Aug ");
                break;

            // For digit 8
            case '9':
                System.out.print("Sep ");
                break;

            // For digit 9
           /* case '10':
                System.out.print("Oct ");
                break;

            case '11':
                System.out.print("Nov ");
                break;
            case '12':
                System.out.print("Dec ");
                break;*/
        }
    }

    // Function to iterate through every
// digit in the given number

    // Driver code
    public static void main(String[] args)
    {
        int n = 1;
        printValue(n);
    }
}

// This code is contributed by 29AjayKumar


