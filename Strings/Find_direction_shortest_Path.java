public class Find_direction_shortest_Path{
    
    public static float Get_shortest_Path(String str){
        int x = 0; // --> x axis.
        int y = 0; // --> y axis.
        
        for(int i=0; i<str.length(); i++){
           
            if(str.charAt(i) == 'E'){ //East direction.
                x++; // +x axis.
            }
            else if(str.charAt(i) == 'W'){ //West direction.
                x--; // -x axis.
            }
            else if(str.charAt(i) == 'N'){ //North direction
                y++; // +y axis.
            }
            else{ // South direction.
                y--; // -y axis.
            }
        }
        
        float X = (x*x);
        float Y = (y*y);
        
        float short_Path = (float)Math.sqrt(X+Y);
        
        return short_Path; //Here return shotest path.
    }
    
    
    public static void main(String args[]){
        String Path1 = "EWNS";
        String Path2 = "WNEENESENNN";
        
        //Here Invoked Get_shortest_Path Method.
        System.out.println("Shortest path1 is : "+Get_shortest_Path(Path1));
        System.out.println("Shortest path2 is : "+Get_shortest_Path(Path2));
    }
}