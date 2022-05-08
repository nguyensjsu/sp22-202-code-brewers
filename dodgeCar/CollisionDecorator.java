public class CollisionDecorator implements ICollisionObject {

	private ICollisionObject ICollisionObject;

    public CollisionDecorator( ICollisionObject c )
    {
        ICollisionObject = c ;
    }

	public String operation()
    {
        return ICollisionObject.operation() ;
    }

}