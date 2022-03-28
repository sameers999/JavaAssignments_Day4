package SnakeAndLadder_1;

class Snake_Ladder{

	int pos=0;
	String name =null;

	Snake_Ladder(int pos,String name){
		this.name=name;
		this.pos=pos;
	}

	public String getName(){
		return name;
	}
	public int getInt() {
		return pos;

	}

	public static void main(String[]args){
		
	Snake_Ladder s= new Snake_Ladder(0,"player1");
		System.out.println(s.getName());
		System.out.println(s.getInt());
		
	}
}
//	private int position = 0;
//    private String name = null;
//    
//    public PlayerImpl(String name){
//        this.name = name;
//    }
//
//    @Override
//    public int getPosition() {
//        return position;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setPosition(int currentPosition) {
//        this.position = currentPosition;
//    }
//
//    @Override
//    public void setName(String playerName) {
//        this.name = playerName;
//    }

//}
