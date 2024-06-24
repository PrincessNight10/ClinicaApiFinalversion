-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Clinica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Clinica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Clinica` DEFAULT CHARACTER SET utf8 ;
USE `Clinica` ;

-- -----------------------------------------------------
-- Table `Clinica`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Paciente` (
  `ID_Paciente` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Direccion` VARCHAR(45) NULL,
  `Telefono` VARCHAR(45) NULL,
  `FechadeNacimiento` DATETIME NULL,
  PRIMARY KEY (`ID_Paciente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Clinica`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Medico` (
  `ID_Medico` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Especialidad` VARCHAR(45) NULL,
  `Direccion` VARCHAR(45) NULL,
  `Telefono` VARCHAR(45) NULL,
  PRIMARY KEY (`ID_Medico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Clinica`.`Citas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Citas` (
  `ID_Citas` INT NOT NULL,
  `MotivoCita` VARCHAR(88) NULL,
  `EstadoCita` ENUM("Confirmada", "Aplasada") NULL,
  `ID_Paciente` INT NOT NULL,
  `ID_Medico` INT NOT NULL,
  PRIMARY KEY (`ID_Citas`),
  CONSTRAINT `fk_Citas_Paciente`
    FOREIGN KEY (`ID_Paciente`)
    REFERENCES `mydb`.`Paciente` (`ID_Paciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Citas_Medico1`
    FOREIGN KEY (`ID_Medico`)
    REFERENCES `mydb`.`Medico` (`ID_Medico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Citas_Paciente_idx` ON `Clinica`.`Citas` (`ID_Paciente` ASC) VISIBLE;

CREATE INDEX `fk_Citas_Medico1_idx` ON `Clinica`.`Citas` (`ID_Medico` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
