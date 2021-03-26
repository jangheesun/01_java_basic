package step1_06.loop;


// # 삼각형 그리기

public class LoopEx22_문제_실습 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i=0; i<9; i++) {
			System.out.print("#");
			if (i%3 == 2) System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
	
		for (int i = 0; i<4; i++ ) {		
			for ( int j = 0 ; j<i ; j++ ) {
				System.out.print("#");
				
			}					
					System.out.println();
				
		}
		System.out.println();
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (int i = 3; i > 0 ; i --) {			
			for (int j= 0; j < i ; j++ ) {
				System.out.print(".");
				
				
				}
			for (int k = -1; k > i ; k -- ) {		
				System.out.print("#");
			}
		
			System.out.println("x");
		}
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
