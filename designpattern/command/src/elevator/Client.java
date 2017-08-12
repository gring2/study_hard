package elevator;

public class Client {
	public static void main(String[] args) {
		ElevatorController controller1 = new ElevatorController(1) ;
		ElevatorController controller2 = new ElevatorController(2) ;

		ElevatorManager em = new ElevatorManager(2) ;
		em.addController(controller1) ;
		em.addController(controller2) ;
		
		// 1�� ������������ 1���� ���� ������ �� ��ư
		Command destinationCommand1stController = new DestinationSelectionCommand(1, controller1) ; 
		ElevatorButton destinationButton1stFloor = new ElevatorButton(destinationCommand1stController) ;
		destinationButton1stFloor.pressed() ;

		
		// 2�� ������������ 2���� ���� ������ �� ��ư
		Command destinationCommand2ndController = new DestinationSelectionCommand(2, controller2) ; 
		ElevatorButton destinationButton2ndFloor = new ElevatorButton(destinationCommand2ndController) ;
		destinationButton2ndFloor.pressed() ;
		
		// 2������ �Ʒ��� �̵��ϱ� ���� ���������� ��û ��ư 
		Command requestDownCommand = new ElevatorRequestCommand(6, Direction.DOWN, em) ;
		ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(requestDownCommand) ;
		
		// 2������ �Ʒ����������� ��û ��ư�� ������
		requestDownFloorButton2ndFloor.pressed() ;
		Command requestDownCommand2 = new ElevatorRequestCommand(2, Direction.UP, em) ;
		ElevatorButton requestDownFloorButton2ndFloor2 = new ElevatorButton(requestDownCommand2) ;

		// 2������ �Ʒ����������� ��û ��ư�� ������
		requestDownFloorButton2ndFloor2.pressed() ;
	}
}
