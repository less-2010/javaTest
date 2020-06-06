package dome02;

public class wc_Arr {


			public static void main(String[] args) {
			String  arr[][]=new String [4][];
				arr[0]=new String [] {"人","之","出","，"};
				arr[1]=new String [] {"性","本","善","。"};
				arr[2]=new String [] {"性","相","近","，"};
				arr[3]=new String [] {"习","相","远","。"};
				System.out.println("横板:");	
				for(int i =0;i<arr.length;i++) {
					
					for(int j=0;j<arr[i].length;j++) {
						
					System.out.print(arr[i][j]+" ");
						
					}
					System.out.println();
					
				}
				System.out.println("竖板:");	
				for(int i =0;i<4;i++) {
							
							for(int j=0;j<4;j++) {
								
							System.out.print(arr[j][i]+" ");
								
							}
							System.out.println();
							
							
						}
						
					}
			}





