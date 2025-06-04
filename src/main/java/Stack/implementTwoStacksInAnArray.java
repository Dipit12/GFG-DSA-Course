package Stack;

class TwoStacks{
    int arr[];
    int cap;
    int top1;
    int top2;

    TwoStacks(int cap){
        this.cap = cap;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }

    boolean push1(int x){
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
            return true;
        }
        return false;
    }

    boolean push2(int x){
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
            return true;
        }
        return false;
    }

    Integer pop1(){
        if(top1 >= 0){
            int x= arr[top1];
            top1--;
            return x;
        }
        return null;
    }
    Integer pop2(){
        if(top2 < cap){
            int x= arr[top2];
            top1++;
            return x;
        }
        return null;
    }

    int size(){
        return (top1+1);
    }
    int size2(){
        return (cap - top2);
    }

}

public class implementTwoStacksInAnArray {

}
