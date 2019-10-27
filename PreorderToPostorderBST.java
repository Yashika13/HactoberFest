/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int d)
    {
        data=d;
        left=right=null;
    }
    
    
    public Node create(Node root,int x)
    {
        Node ptr=root;
        Node s = new Node(x);
        
        while(true)
        {
            if(ptr.data<x)
            {
                if(ptr.right==null)
                {
                    ptr.right=s;
                    break;
                }
                else{
                    ptr=ptr.right;
                }
                
            }
            else
            {
                if(ptr.left==null)
                {
                    ptr.left=s;
                    break;
                }
                else{
                    ptr=ptr.left;
                }
                
            }
        }
        
        return root;
    }
    
    public void  traverse(Node s)
    {
        if(s!=null)
        {
            traverse(s.left);   
            traverse(s.right);
            System.out.print(s.data+" ");
        }
    }
    
    

}



class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int a = sc.nextInt();
		    int arr[] = new int[a];
		    
		    for(int i=0;i<a;i++)
		    {
		        arr[i]=sc.nextInt();   
		    }
		    
		   Node n = new Node(arr[0]); 
		   
		   for(int i=1;i<a;i++)
		   n = n.create(n,arr[i]); 
		    
		   n.traverse(n); 
		    
		    
		   System.out.println(); 
		}
	}
}
