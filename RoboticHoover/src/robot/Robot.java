package robot;

public class Robot {
	
	private int m_x =0;
	private int m_y =0;
	private int cleanedPatch = 0;
	public int getCleanedPatch() {
		return cleanedPatch;
	}

	private Integer[][] dirtyPatch ;
	private Integer[] m_roomSize;
	
	public void setDirtyPatch(Integer[][] argDirtyPatch){
		
		dirtyPatch = argDirtyPatch;
	}
	
	public void setLocation(int x, int y){
		m_x = x;
		m_y = y;
	}
	
	public Integer[] getLoation(){
		return new Integer[]{m_x,m_y};
	}
	
	public void move(char direction){
		
		if(direction=='N'){
			if(m_y==m_roomSize[1]) return;
			m_y++;
		}else if(direction=='S'){
			if(m_y==0) return;
			m_y--;
		}else if(direction=='W'){
			if(m_x==0) return;
			m_x--;
		}else if(direction =='E'){
			if(m_x == m_roomSize[0]) return;
			m_x++;
		}
		
	}
	
	public void clean(){
		
		for(int i=0;i<dirtyPatch.length;i++){
			if((m_x==dirtyPatch[i][0])&&(m_y==dirtyPatch[i][1])){
				
				cleanedPatch ++;
				dirtyPatch[i][0] = -1;
				dirtyPatch[i][1] = -1;
			}
		}
		
	}

	public void setRoomSize(Integer[] roomSize) {
		// TODO Auto-generated method stub
		m_roomSize = roomSize;
	}

}
