public interface IKeyboardCommand {
    /** Execute the Command */
    void execute();

    /** 
     * Configure the Receiver for the Command
     * @param target Receiver
     */
    void setReceiver(IKeyboardReceiver target);
}