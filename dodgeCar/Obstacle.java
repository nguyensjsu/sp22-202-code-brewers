public class Obstacle extends CollisionDecorator {

	private String addedState;

    public Obstacle( ICollisionObject c)
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