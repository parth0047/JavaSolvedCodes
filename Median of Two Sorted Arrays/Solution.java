
class Solution {
    public  double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m= nums1.length;
        int n=nums2.length;
        int merge[] = new int[m+n];
        for(int i= 0, k=0; i<m+n ;i++)
        {
            if(i<m)
            {
                merge[i] = nums1[i];
                continue;
            }
            else if(k<n)
            {
                merge[i] =nums2[k];
                k++;
            }

        }
        sort(merge);
        System.out.println("The array is::");
        for(int i: merge)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int len=merge.length;
        if(len%2==0)
        {
            int low=(len/2)-1;
            return (merge[low]+merge[low+1])/2.0;
            
        }
        else
        {
            return (len+1)/2.0;
        }
    }
    public static void main(String X[])
    {
        int nums1[]= {1,2};
        int nums2[] = {3,4};
        Solution ma= new Solution();
        double median = ma.findMedianSortedArrays(nums1,nums2);
        System.out.print("The median is:: "+ median);
    }
    public static int[] sort(int[] merge)
    {
        int min,temp;
        for(int i=0;i<merge.length;i++)
        {
            min = i;
            for(int k = i+1; k<merge.length; k++ )
            {
                if(merge[i]>merge[k])
                {
                    min=k;
                }
            }
            temp=merge[i];
            merge[i]=merge[min];
            merge[min]=temp;
        }
        return merge;

    }
    
}
