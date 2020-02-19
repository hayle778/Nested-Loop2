public class JavaBasic {
public static void main(String[]args) {

for(int i = 0; i<4; i++){
    System.out.println( "It is so freaking cold outside!" );
}

//String[]colors = {"red", "blue", "green"};
//for(int i = 0; i<3; i++){

  //  System.out.println( colors [i]);
//}
String[][]fancyColors = {{"Red", "purple", "yellow"},
                         {"blue", "brown", "pink"}};


// i is the row and j is the column
for(int row  = 0; row<3; row++) {
for(int col = 0; col<3; col++){
   // System.out.println( fancyColors[row][col] );
   System.out.println( fancyColors[1] [2]);
}

}

}

}
