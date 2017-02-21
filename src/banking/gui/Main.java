//JOSH CHANGED THIS | ISSUE #4
/**
  Class: Main
  
  Description: This is the main class where the program is all connected to. It is the program where the program can run. It makes sure the array of args is only having a length of one. If it does not, then the program exits. 
*/

package banking.gui;



import javax.swing.JFrame;



/**

 * main method for running the program.

 * @author kevinagary

 *

 */

final class Main {

	/**

	 * Private constructor to address STYLE issue.

	 */

	private Main() {

	}

	

	/**

	 * All methods should have a Javadoc according to STYLE.

	 * @param args command-line arguments

	 * @throws Exception as per typical main specifications

	 */

	public static void main(final String[] args) throws Exception {



		if (args.length != 1) {

			System.out.println("Usage: java FormMain <property file>");

			System.exit(1);

		}



		String propertyFile = args[0];

		JFrame frame = new MainFrame(propertyFile);

		frame.setVisible(true);



	}

}

