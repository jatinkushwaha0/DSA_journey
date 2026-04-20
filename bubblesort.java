import java.util.*;
class bubblesort{
    public static int search(int i[] , int j[]){
        for(int k=0;k<j.length;k++){
            if(i[1]==j[k]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        return -1;
    }
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int arrd[] = new int[v];
        for(int j = 0; j < v; j++) {
            arrd[j] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
          System.out.println();
         for(int j = 0; j < v; j++) {
               System.out.print(arrd[j] + " ");
         }
         sc.close();
        search();
	}
}
