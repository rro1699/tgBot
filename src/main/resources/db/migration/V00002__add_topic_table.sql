CREATE TABLE `dev_sjb_db`.`topic` (
`idtopic` INT NOT NULL,
`nameTopic` VARCHAR(25) NOT NULL,
`content` MEDIUMTEXT NOT NULL,
`question` TINYTEXT NOT NULL,
`optionsofanswer` JSON NOT NULL,
PRIMARY KEY (`idtopic`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4;
