public class KeyboardCommand implements IKeyboardCommand {
    IKeyboardReceiver target ;
    
    /** Execute Command */
    public void execute() 
    {
        target.doAction() ;
    }
    
    /**
     * Set Receiver of Command
     * @param t Target Receiver
     */
    public void setReceiver( IKeyboardReceiver t ) 
    {
        target = t ;
    }
}
