public interface IKeyInputInvoker
{
    /**
     * Set Command for Invoker
     * @param c Command Object
     */
    void setCommand( IKeyboardCommand c ) ;

    /** Invoke Keyboard Function */
    void invoke() ;
}
