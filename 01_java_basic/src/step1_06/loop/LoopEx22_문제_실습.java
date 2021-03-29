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
		
		for(int j = 3; j>0 ; j--) {
		
				for(int i = j; i > 0 ; i--) {
					System.out.print(" ");
					}
				for(int i = j; i < 4 ; i++) {
					System.out.print("#");
					}
				System.out.println();
		}
				
		
		
		System.out.println();
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		for(int j = 3; j>0 ; j--) {
			
			for(int i = j; i > 0 ; i--) {
				System.out.print("#");
				}
			System.out.println();
	}
		
		
		
		
		System.out.println();
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		for(int i = 3 ; i > 0 ; i -- ) {
			
				
			
				for(int k = 0 ; k < 3-i ; k++) {
					System.out.print(" ");
				}
				
				for( int j = i ; j > 0 ; j-- ) {
					System.out.print("#");				
				}
				System.out.println();
				
		}
		
		System.out.println();
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		
		for (int i = 1 ; i < 4 ; i++ ) {
			for( int j = 0 ; j< i ; j++ ) {
				System.out.print("@");
				}
			for( int k = 3 ; k > i ; k--) {
				System.out.print("#");;
				}
			System.out.println(" ");
			}
		System.out.println();
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		for(int i = 3 ; i > 0 ; i--){
			
				for(int j = 0 ; j < i ; j ++) {
					System.out.print(" ");
					
				}
				for(int k = 6 ; k > (2*i-1) ; k--) {
					System.out.print("#");
				}
				System.out.println();

		}
		System.out.println();
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		for(int i = 0; i < 3 ; i ++) {
				for(int k = i ; k < i ; k++) {
					System.out.print("@");
				
				for(int j = (2*k-1) ; (2*k-1) < 0 ; i--) {
				System.out.print("#");
				}
				}
				System.out.println();
		}
		
	}
}
