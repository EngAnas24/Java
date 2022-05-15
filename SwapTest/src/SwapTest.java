
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


class Solution {
	
	class node{
		int x,step;
		public node(int x,int step) {
			this.x=x;
			this.step=step;
		}
	}
	
	int[][] a;
	boolean[] flag;
	boolean[] mark;
	Map<Integer,int[]> map;
	
	
    public int snakesAndLadders(int[][] board) {
    	
    	int n=board.length;
    	a=new int[n][n];
    	flag=new boolean[n*n+1];
    	mark=new boolean[n*n+1];
    	map=new HashMap<>();
    	Queue<node> q=new LinkedList<>();
    	
    	int size=0;
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			for(int j=0;j<n;j++) {
    				a[n-1-i][j]=++size;
    				map.put(size, new int[2]);
    				map.get(size)[0]=n-1-i;
    				map.get(size)[1]=j;
    			}
    		}
    		else {
    			for(int j=n-1;j>=0;j--) {
    				a[n-1-i][j]=++size;
    				map.put(size, new int[2]);
    				map.get(size)[0]=n-1-i;
    				map.get(size)[1]=j;
    			}
    		}
    	}
    	
    	q.add(new node(1,0));
    	flag[1]=true; mark[1]=true;
    	
    	while(!q.isEmpty()) {
    		node now=q.poll();
    		if(now.x==n*n)
    			return now.step;
    		for(int i=1;i<7;i++) {
    			int x=now.x+i;
    			if(x>n*n) break;
    			if(flag[x]) continue;
    			flag[x]=true;
    			int xx=map.get(x)[0];
    			int yy=map.get(x)[1];
    			if(board[xx][yy]!=-1 && !mark[board[xx][yy]]) {
    				mark[board[xx][yy]]=true;
    				q.add(new node(board[xx][yy],now.step+1));
    			}
    			else if(board[xx][yy]==-1)
    				q.add(new node(x,now.step+1));
    		}
    	}
    	
    	return -1;
    }
}
 