package State;

public class Canvas {
    // this class should be response to the mouse event
    // like mouse up, mouse down

    // so depending on the current selecting tool, both events.
    // going to change
    // what's the current selecting tool representing using Enum >> set of constents

    // field to store the current selecting tool
    private Tool currentTole;

    public void mouseDown(){
//        if(currentTole == ToolType.SELECTION) {
//            System.out.println("Selection icon");
//        } else if (currentTole == ToolType.BRUSH) {
//            System.out.println("Brush icon");
//        } else if (currentTole == ToolType.ERASER) {
//            System.out.println("Eraser icon");
//        }

        currentTole.mouseDown();
    }
    public void mouseUp(){
//        if(currentTole == ToolType.SELECTION) {
//            System.out.println("Draw dashed rectangle");
//        } else if (currentTole == ToolType.BRUSH) {
//            System.out.println("Draw a line");
//        } else if (currentTole == ToolType.ERASER) {
//            System.out.println("Eraser something");
//        }
        currentTole.mouseUp();
    }

    public Tool getCurrentTole() {
        return currentTole;
    }

    public void setCurrentTole(Tool currentTole) {
        this.currentTole = currentTole;
    }
}
