public class Life extends CollisionDecorator {

	private String addedState;

    public Life( ICollisionObject c)
    {
        super( c ) ;
    }

    public String operation()
    {
        addedState = super.operation() ;
        return addedBehavior( addedState ) ;
    }

	private String addedBehavior(String in) {
		return "<em>" + addedState + "</em>" ;
	}

}