class defgen<G>
{ G obj;
	defgen(G ob)
	{ obj=ob;
	}
	G getobj()
	{ return obj;
	}
	
	void displaytype()
	{ System.out.println("G is having following type :- "+ obj.getClass().getName());
	}
}
class genfeature
{
	public static void main(String args[])
	{ 
		 defgen<Integer> iogen;
			iogen=new defgen<Integer>(100);
			iogen.displaytype();
			int val=iogen.getobj();
			System.out.println("value is equal to - "+val);
			System.out.println ();
		}
}
