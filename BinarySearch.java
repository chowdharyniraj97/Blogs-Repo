class BinarySearch{
    public static void main(String args[]){
        int arr[]= {10,20,43,67,97};
        int index= binarySearch(arr,0,arr.length-1,97);
    }
}
int binarySearch(int arr,int low,int high,int key)
{
   while(low<=high)
   {
     int mid=(low+high)/2;
     if(arr[mid]==key)
     {
         return mid;
     }
     else if(arr[mid]<key)
     {
         low=mid+1;
     }
     else
     {
        high=mid-1;
     }
   }
   return -1;  //key not found
 }