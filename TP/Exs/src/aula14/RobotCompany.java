public class RobotCompany{

    public static Robot createRobot(RobotType type, int ID, String nome) {

       switch (type) {
        case DEFENDER:
            return new RobotDefender(ID, nome);
        case ATTACKER:
            return new RobotAttacker(ID, nome);
        case GOALIE:
            return new RobotGoalie(ID, nome);
       
        default:
            return null;
       }
    }
   
}
