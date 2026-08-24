package HomeWorkPatterns.Facade.DoorFacade;

public class DoorFacade {
    private DoorOpen doorOpen;
    private CloseDoor closeDoor;
    private LockDoor lockDoor;

    public DoorFacade() {
        doorOpen = new DoorOpen();
        closeDoor = new CloseDoor();
        lockDoor = new LockDoor();
    }

    public void openDoor() {
        lockDoor.unlock();
        doorOpen.openDoor();
    }

    public void closeDoor() {
        closeDoor.closeDoor();
    }

    public void lockDoor() {
        closeDoor.closeDoor();
        lockDoor.lock();

    }

    static void main() {
        DoorFacade doorFacade = new DoorFacade();
        doorFacade.openDoor();
        doorFacade.closeDoor();
        doorFacade.lockDoor();
    }
}

