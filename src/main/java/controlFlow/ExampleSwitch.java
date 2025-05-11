package controlFlow;

public class ExampleSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension){
            case "docx":
                System.out.println("This a document file");
                break;
            case "ppt":
                System.out.println("This a presentation file");
                break;
            case "txt":
                System.out.println("This a txt file");
                break;
            case "pdf":
                System.out.println("This a pdf file");
                break;
            default:
                System.out.println("Unrecognized file");
                break;
        }

    }
}
