import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardReader {
    public static ArrayList<ChessPlayer> getChessPlayersArray() throws Exception {
        ArrayList chessPlayers = new ArrayList<ChessPlayer>();
        for (int i = 0; i < new File("cards/chess").list().length; i++) {
            try {
                ChessPlayer chessPlayer = new ChessPlayer();
                FileReader fr = new FileReader("cards/chess/" + i + ".txt");
                fr.read();
                Scanner scan = new Scanner(fr);
                if (scan.hasNextLine()) {
                    chessPlayer.setSurname(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setName(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setFatherName(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setDateOfBirth(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setLocation(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setPhone(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setHomePhone(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setPlaceOfStudy(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setBirthCertificateSeries(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setBirthCertificateNumber(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setBirthCertificateGive(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setPassportSeries(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setPassportNumber(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setPassportGive(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setIdentificationNumber(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setChernobylCertificateNumber(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setAdditionalData(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setAgeStart(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setYearStartOfSportSchool(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setYearEndOfSportSchool(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setFirstTrainerSurname(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setFirstTrainerName(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setFirstTrainerFatherName(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setCurrentTrainerSurname(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setCurrentTrainerName(scan.nextLine());
                }
                if (scan.hasNextLine()) {
                    chessPlayer.setCurrentTrainerFatherName(scan.nextLine());
                }
                fr.close();
                chessPlayers.add(chessPlayer);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        return chessPlayers;
    }
}
