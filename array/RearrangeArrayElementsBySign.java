import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int [] arr = {3,1,-2,-5,2,-4};
        System.out.println("Before Rearranging: "+Arrays.toString(arr));
        System.out.println("After rearranging: " + Arrays.toString(rearrange(arr)));
    }

    public static int [] rearrange(int []arr){
        int positive = 0;
        int negative = 1;
        int [] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[negative] = arr[i];
                negative+=2;
            }
            else{
                ans[positive] = arr[i];
                positive+=2;
            }
        }
        return ans;
    }
}

//js code if positve and negative is not equal 
// const rearrange = (arr)=>{
//     const posi = [];
//     const negative = [];
//     const ans = [];
//     for(let i=0;i<arr.length;i++){
//         if(arr[i]<0){
//             negative.push(arr[i]);
//         }
//         else{
//             posi.push(arr[i]);
//         }
//     }

//     let i =0;
//     let j =0;
//     let x = 0;
//     while(i<posi.length && j<negative.length){
//           if(x%2 == 0){
//             ans[x] = posi[i];
//             x++;
//             i++;
//           }
//           else{
//             ans[x] = negative[j];
//             x++;
//             j++;
//           }
//       }

//       while(i<posi.length){
//         ans[x] = posi[i];
//         i++;
//         x++;
//       }

//       while(j<negative.length){
//         ans[x] = negative[j];
//         j++;
//         x++;
//       }
//    }