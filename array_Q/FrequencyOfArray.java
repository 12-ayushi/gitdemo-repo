package ArrayPractice;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,3};
        System.out.println(countFrequency(arr,2));
    }
    static int countFrequency(int arr[],int n){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
                if(arr[i]==n){
                    count++;
                }
        }
        return count;
    }
}
