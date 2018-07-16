package largestTriangleArea;

public class LargestTriangleArea {
public double largestTriangleArea(int[][] points) {
	    double area=0;
        for(int i=0;i<points.length-2;i++)
        	for(int j=i+1;j<points.length-1;j++)
        		for(int k=j+1;k<points.length;k++){
        			int ABx=points[i][0]-points[j][0];
        			int ABy=points[i][1]-points[j][1];
        			int ACx=points[i][0]-points[k][0];
        			int ACy=points[i][1]-points[k][1];
        			area=Math.max(area, Math.abs(0.5*(ABx*ACy-ACx*ABy)));
        		}
        return area;
    }
public static void main(String[] args){
	LargestTriangleArea ltl=new LargestTriangleArea();
	int p[][]={{0,0},{0,1},{1,0},{0,2},{2,0}};
	System.out.println(ltl.largestTriangleArea(p));
}
}
