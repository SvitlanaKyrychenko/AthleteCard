public abstract class Athlete {

    protected String surname;
    protected String name;
    protected String fatherName;

    protected String dateOfBirth;

    protected String location;
    protected String phone;
    protected String homePhone;
    protected String placeOfStudy;

    protected String birthCertificateSeries;
    protected String birthCertificateNumber;
    protected String birthCertificateGive;

    protected String passportSeries;
    protected String passportNumber;
    protected String passportGive;

    protected String foreignPassportSeries;
    protected String foreignPassportNumber;
    protected String foreignPassportGive;

    protected String identificationNumber;
    protected String chernobylCertificateNumber;

    protected String additionalData;
    protected String ageStart;
    protected String yearStartOfSportSchool;
    protected String yearEndOfSportSchool;

    protected String firstTrainerSurname;
    protected String firstTrainerName;
    protected String firstTrainerFatherName;

    protected String currentTrainerSurname;
    protected String currentTrainerName;
    protected String currentTrainerFatherName;


    Athlete(final String surname,
            final String name,
            final String fatherName,
            final String dateOfBirth,
            final String location,
            final String phone,
            final String homePhone,
            final String placeOfStudy,
            final String birthCertificateSeries,
            final String birthCertificateNumber,
            final String birthCertificateGive,
            final String passportSeries,
            final String passportNumber,
            final String passportGive,
            final String foreignPassportSeries,
            final String foreignPassportNumber,
            final String foreignPassportGive,
            final String identificationNumber,
            final String chernobylCertificateNumber,
            final String additionalData,
            final String ageStart,
            final String yearStartOfSportSchool,
            final String yearEndOfSportSchool,
            final String firstTrainerSurname,
            final String firstTrainerName,
            final String firstTrainerFatherName,
            final String currentTrainerSurname,
            final String currentTrainerName,
            final String currentTrainerFatherName) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.location = location;
        this.phone = phone;
        this.homePhone = homePhone;
        this.placeOfStudy = placeOfStudy;
        this.birthCertificateSeries = birthCertificateSeries;
        this.birthCertificateNumber = birthCertificateNumber;
        this.birthCertificateGive = birthCertificateGive;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportGive = passportGive;
        this.foreignPassportSeries = foreignPassportSeries;
        this.foreignPassportNumber = foreignPassportNumber;
        this.foreignPassportGive = foreignPassportGive;
        this.identificationNumber = identificationNumber;
        this.chernobylCertificateNumber = chernobylCertificateNumber;
        this.additionalData = additionalData;
        this.ageStart = ageStart;
        this.yearStartOfSportSchool = yearStartOfSportSchool;
        this.yearEndOfSportSchool = yearEndOfSportSchool;
        this.firstTrainerSurname = firstTrainerSurname;
        this.firstTrainerName = firstTrainerName;
        this.firstTrainerFatherName = firstTrainerFatherName;
        this.currentTrainerSurname = currentTrainerSurname;
        this.currentTrainerName = currentTrainerName;
        this.currentTrainerFatherName = currentTrainerFatherName;
    }

    Athlete() {

    }

    public abstract String getSurname();

    public abstract String getName();

    public abstract String getFatherName();

    public abstract String getDateOfBirth();

    public abstract String getLocation();

    public abstract String getPhone();

    public abstract String getHomePhone();

    public abstract String getPlaceOfStudy();

    public abstract String getBirthCertificateSeries();

    public abstract String getBirthCertificateNumber();

    public abstract String getBirthCertificateGive();

    public abstract String getPassportSeries();

    public abstract String getPassportNumber();

    public abstract String getPassportGive();

    public abstract String getForeignPassportSeries();

    public abstract String getForeignPassportNumber();

    public abstract String getForeignPassportGive();

    public abstract String getIdentificationNumber();

    public abstract String getChernobylCertificateNumber();

    public abstract String getAdditionalData();

    public abstract String getAgeStart();

    public abstract String getYearStartOfSportSchool();

    public abstract String getYearEndOfSportSchool();

    public abstract String getFirstTrainerSurname();

    public abstract String getFirstTrainerName();

    public abstract String getFirstTrainerFatherName();

    public abstract String getCurrentTrainerSurname();

    public abstract String getCurrentTrainerName();

    public abstract String getCurrentTrainerFatherName();


    public abstract void setSurname(String surname);

    public abstract void setName(String name);

    public abstract void setFatherName(String fatherName);

    public abstract void setDateOfBirth(String fatherName);

    public abstract void setLocation(String location);

    public abstract void setPhone(String phone);

    public abstract void setHomePhone(String homePhone);

    public abstract void setPlaceOfStudy(String placeOfStudy);

    public abstract void setBirthCertificateSeries(String birthCertificateSeries);

    public abstract void setBirthCertificateNumber(String birthCertificateNumber);

    public abstract void setBirthCertificateGive(String birthCertificateGive);

    public abstract void setPassportSeries(String passportSeries);

    public abstract void setPassportNumber(String passportNumber);

    public abstract void setPassportGive(String passportGive);

    public abstract void setForeignPassportSeries(String foreignPassportSeries);

    public abstract void setForeignPassportNumber(String foreignPassportNumber);

    public abstract void setForeignPassportGive(String foreignPassportGive);

    public abstract void setIdentificationNumber(String identificationNumber);

    public abstract void setChernobylCertificateNumber(String chernobylCertificateNumber);

    public abstract void setAdditionalData(String additionalData);

    public abstract void setAgeStart(String ageStart);

    public abstract void setYearStartOfSportSchool(String yearStartOfSportSchool);

    public abstract void setYearEndOfSportSchool(String yearEndOfSportSchool);

    public abstract void setFirstTrainerSurname(String firstTrainerSurname);

    public abstract void setFirstTrainerName(String firstTrainerName);

    public abstract void setFirstTrainerFatherName(String firstTrainerFatherName);

    public abstract void setCurrentTrainerSurname(String currentTrainerSurname);

    public abstract void setCurrentTrainerName(String currentTrainerName);

    public abstract void setCurrentTrainerFatherName(String currentTrainerFatherName);
}
