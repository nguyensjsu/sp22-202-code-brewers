public class KeyInputMenuItem implements IKeyInputInvoker
{
    private IKeyboardCommand cmd ;

    /**
     * Set Command for Keyboard Input
     * @param c [description]
     */
    public void setCommand( IKeyboardCommand c ) {
        cmd = c ;
    }

    /** Invoke Keyboard Option */
    public void invoke() 
    {
        cmd.execute() ;
    }
    
}