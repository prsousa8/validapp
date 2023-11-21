-- trigger senha
DELIMITER $$
DROP TRIGGER IF EXISTS `equipe<494871>`.`senha_cripto` $$
USE `equipe<494871>`$$

CREATE DEFINER=`root`@`localhost` TRIGGER `senha_cript` BEFORE INSERT ON `funcionarios` FOR EACH ROW BEGIN
	SET NEW.senha = md5(NEW.senha);
END$$
DELIMITER ;

-- trigger novo funcionario
DELIMITER $$
DROP TRIGGER IF EXISTS `equipe<494871>`.`novo_func` $$
USE `equipe<494871>`$$

CREATE DEFINER=`root`@`localhost` TRIGGER `novo_func` AFTER INSERT ON `funcionarios` FOR EACH ROW BEGIN
	UPDATE agencia
    SET salario_montante_total = salario_montante_total + NEW.salario
    WHERE ID = NEW.AGENCIA_ID;
END
DELIMITER ;

-- trigger atualiza salario do funcionario
DELIMITER $$
DROP TRIGGER IF EXISTS `equipe<494871>`.`atuali_func` $$
USE `equipe<494871>`$$

CREATE DEFINER=`root`@`localhost` TRIGGER `atuali_func` AFTER UPDATE ON `funcionarios` FOR EACH ROW BEGIN
	UPDATE agencia
    SET salario_montante_total = salario_montante_total - (OLD.salario - NEW.salario) 
    WHERE ID = NEW.AGENCIA_ID;
END
DELIMITER ;

-- trigger remove funcionario
DELIMITER $$
DROP TRIGGER IF EXISTS `equipe<494871>`.`rem_func` $$
USE `equipe<494871>`$$

CREATE DEFINER=`root`@`localhost` TRIGGER `rem_func` AFTER DELETE ON `funcionarios` FOR EACH ROW BEGIN
	UPDATE agencia
    SET salario_montante_total = salario_montante_total - OLD.salario
    WHERE ID = OLD.AGENCIA_ID;
END
DELIMITER ;

-- trigger controle de quantidade de dependentes
DELIMITER $$
DROP TRIGGER IF EXISTS `equipe<494871>`.`qtd_dependentes` $$
USE `equipe<494871>`$$

CREATE DEFINER=`root`@`localhost` TRIGGER `qtd_dependentes` BEFORE INSERT ON `dependentes` FOR EACH ROW BEGIN
	DECLARE quant_depen INT;
    
    SELECT COUNT(*) INTO quant_depen FROM dependentes WHERE FUNCIONARIOS_matricula_login = NEW.FUNCIONARIOS_matricula_login;
    
    IF quant_depen = 5 THEN
		SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Limite de dependentes atingido';
    END IF;
END
DELIMITER ;