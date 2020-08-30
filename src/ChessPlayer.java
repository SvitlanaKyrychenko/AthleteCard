public class ChessPlayer extends Athlete {
    public KindOfSport kindOfSport;

    public ChessPlayer(String surname,
                       String name,
                       String fatherName,
                       String dateOfBirth,
                       String location,
                       String phone,
                       String homePhone,
                       String placeOfStudy,
                       String birthCertificateSeries,
                       String birthCertificateNumber,
                       String birthCertificateGive,
                       String passportSeries,
                       String passportNumber,
                       String passportGive,
                       String foreignPassportSeries,
                       String foreignPassportNumber,
                       String foreignPassportGive,
                       String identificationNumber,
                       String chernobylCertificateNumber,
                       String additionalData,
                       String ageStart,
                       String yearStartOfSportSchool,
                       String yearEndOfSportSchool,
                       String firstTrainerSurname,
                       String firstTrainerName,
                       String firstTrainerFatherName,
                       String currentTrainerSurname,
                       String currentTrainerName,
                       String currentTrainerFatherName) {
        super(surname, name, fatherName, dateOfBirth, location, phone, homePhone, placeOfStudy, birthCertificateSeries,
                birthCertificateNumber, birthCertificateGive, passportSeries, passportNumber, passportGive,
                foreignPassportSeries, foreignPassportNumber, foreignPassportGive, identificationNumber,
                chernobylCertificateNumber, additionalData, ageStart, yearStartOfSportSchool,
                yearEndOfSportSchool, firstTrainerSurname, firstTrainerName, firstTrainerFatherName,
                currentTrainerSurname, currentTrainerName, currentTrainerFatherName);
        kindOfSport = KindOfSport.CHESS;
    }

    public ChessPlayer() {

    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFatherName() {
        return fatherName;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getHomePhone() {
        return homePhone;
    }

    @Override
    public String getPlaceOfStudy() {
        return placeOfStudy;
    }

    @Override
    public String getBirthCertificateSeries() {
        return birthCertificateSeries;
    }

    @Override
    public String getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    @Override
    public String getBirthCertificateGive() {
        return birthCertificateGive;
    }

    @Override
    public String getPassportSeries() {
        return passportSeries;
    }

    @Override
    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String getPassportGive() {
        return passportGive;
    }

    @Override
    public String getForeignPassportSeries() {
        return foreignPassportSeries;
    }

    @Override
    public String getForeignPassportNumber() {
        return foreignPassportNumber;
    }

    @Override
    public String getForeignPassportGive() {
        return foreignPassportGive;
    }

    @Override
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String getChernobylCertificateNumber() {
        return chernobylCertificateNumber;
    }

    @Override
    public String getAdditionalData() {
        return additionalData;
    }

    @Override
    public String getAgeStart() {
        return ageStart;
    }

    @Override
    public String getYearStartOfSportSchool() {
        return yearStartOfSportSchool;
    }

    @Override
    public String getYearEndOfSportSchool() {
        return yearEndOfSportSchool;
    }

    @Override
    public String getFirstTrainerSurname() {
        return firstTrainerSurname;
    }

    @Override
    public String getFirstTrainerName() {
        return firstTrainerName;
    }

    @Override
    public String getFirstTrainerFatherName() {
        return firstTrainerFatherName;
    }

    @Override
    public String getCurrentTrainerSurname() {
        return currentTrainerSurname;
    }

    @Override
    public String getCurrentTrainerName() {
        return currentTrainerName;
    }

    @Override
    public String getCurrentTrainerFatherName() {
        return currentTrainerFatherName;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Override
    public void setPlaceOfStudy(String placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    @Override
    public void setBirthCertificateSeries(String birthCertificateSeries) {
        this.birthCertificateSeries = birthCertificateSeries;
    }

    @Override
    public void setBirthCertificateNumber(String birthCertificateNumber) {
        this.birthCertificateNumber = birthCertificateNumber;
    }

    @Override
    public void setBirthCertificateGive(String birthCertificateGive) {
        this.birthCertificateGive = birthCertificateGive;
    }

    @Override
    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    @Override
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public void setPassportGive(String passportGive) {
        this.passportGive = passportGive;
    }

    @Override
    public void setForeignPassportSeries(String foreignPassportSeries) {
        this.foreignPassportSeries = foreignPassportSeries;
    }

    @Override
    public void setForeignPassportNumber(String foreignPassportNumber) {
        this.foreignPassportNumber = foreignPassportNumber;
    }

    @Override
    public void setForeignPassportGive(String foreignPassportGive) {
        this.foreignPassportGive = foreignPassportGive;
    }

    @Override
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public void setChernobylCertificateNumber(String chernobylCertificateNumber) {
        this.chernobylCertificateNumber = chernobylCertificateNumber;
    }

    @Override
    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public void setAgeStart(String ageStart) {
        this.ageStart = ageStart;
    }

    @Override
    public void setYearStartOfSportSchool(String yearStartOfSportSchool) {
        this.yearStartOfSportSchool = yearStartOfSportSchool;
    }

    @Override
    public void setYearEndOfSportSchool(String yearEndOfSportSchool) {
        this.yearEndOfSportSchool = yearEndOfSportSchool;
    }

    @Override
    public void setFirstTrainerSurname(String firstTrainerSurname) {
        this.firstTrainerSurname = firstTrainerSurname;
    }

    @Override
    public void setFirstTrainerName(String firstTrainerName) {
        this.firstTrainerName = firstTrainerName;
    }

    @Override
    public void setFirstTrainerFatherName(String firstTrainerFatherName) {
        this.firstTrainerFatherName = firstTrainerFatherName;
    }

    @Override
    public void setCurrentTrainerSurname(String currentTrainerSurname) {
        this.currentTrainerSurname = currentTrainerSurname;
    }

    @Override
    public void setCurrentTrainerName(String currentTrainerName) {
        this.currentTrainerName = currentTrainerName;
    }

    @Override
    public void setCurrentTrainerFatherName(String currentTrainerFatherName) {
        this.currentTrainerFatherName = currentTrainerFatherName;
    }

    @Override
    public String toString() {
        String result = "Прізвище " + surname + "\n" +
                "Ім'я " + name + "\n" +
                "Побатькові " + fatherName + "\n";
        return result;
    }
}
