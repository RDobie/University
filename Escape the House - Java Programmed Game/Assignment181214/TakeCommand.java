/**
 
 * TakeCommand Class
 
 * 
 
 * @author Alexandre Boursier and Nolan Potier
 
 * @version 2011.10.24
 
 */
 
public class TakeCommand extends Command
 
{
 
    /**
 
     * Constructor for objects of class GoCommand
 
     */
 
    public TakeCommand() {}
 

 
    /**
 
     * Try to take an item if present into the room
 
     * We have to be in the good room
 
     * Returns always 'false'.
 
     */
 
    @Override
 
    public boolean execute(Player player)
 
    {
 
        if(player.getCurrentRoom().getItem() == null) {
 
            System.out.println("There is nothing to take there !");
 
        }
 
        else if (!hasSecondWord()) {
 
            System.out.println("take what?");
 
        } 
 
        else if (! getSecondWord().equals(player.getCurrentRoom().getItem().getName().toLowerCase())){
 
            System.out.println("There is nothing like that to take !");
 
        }
 
        else
 
        {
 
            if(Game.hasGot_key(getSecondWord()))
 
            {
 
                player.addItem(player.getCurrentRoom().takeItem());     
 
                
 
                System.out.println("You've just found a Key ! :) ");
 
                //System.out.println("Use it the right way");
 
                /*for (Room r : Game.getRooms())
 
                {
 
                    if (r.getType().equals(Type.DELIVERY_ROOM))
 
                        r.setDescription("in the delivery room");
 
                    if (r.getType().equals(Type.RECEPTION))
 
                        r.setDescription("in the reception -- Here you can use your GOLDEN KEY ");
 
                }
 
                Game.setGot_key(true);*/
 
            }
 
            else 
 
                System.out.println("The key have already been taken ! Have you lost it ?!");
 
        }
 
        return false;
 
    }
 
}
 
