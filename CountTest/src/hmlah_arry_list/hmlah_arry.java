/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmlah_arry_list;

/**
 *
 * @author dell
 */
class hmlah_arry {
     
 static int  size_arry=0;
 static int count =0;
 boolean isEmpty( )
 {
  return count==0;
  
 }
Private int [ ]ar=new int [size ];
 public void add1(int d)
 {
for (int i=0;i<ar.lengh;i++)
if(isEmpty())
{
  ar[i]=d;
Count++;
  
}
 else
 {size ++;
add_new_arry(d);}
 }
private void add-new-arry(int d)
{
for(int i=0;iarr.lengh-1;i++)
{ar[i]=ar[i];
}
ar[ar.lengh]=d;
count++;
}
}
