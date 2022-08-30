-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Ago-2022 às 17:04
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `usuario`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `boletos`
--

CREATE TABLE `boletos` (
  `idboleto` int(45) NOT NULL,
  `valor` double(6,2) DEFAULT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `datadepagamento` varchar(10) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `forma` varchar(45) DEFAULT NULL,
  `parcelas` varchar(45) DEFAULT NULL,
  `adicionado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE `cadastro` (
  `iduzer` int(45) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `gmail` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `senh` varchar(45) DEFAULT NULL,
  `nacionalidade` varchar(45) DEFAULT NULL,
  `nacimento` varchar(45) DEFAULT NULL,
  `nick` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`iduzer`, `nome`, `gmail`, `telefone`, `senh`, `nacionalidade`, `nacimento`, `nick`) VALUES
(1, 'Lorran', 'rodriguesbromen@gmail.com', '(85) 9 8909-8367', '134', 'Brasil', '28/07/2003', 'Adm'),
(4, 'Lorran', 'rodriguebromengmail.com', '(85) 9 8909-8367', '154', 'chileno', '28/07/2003', 'uzerio'),
(5, 'leo', 'rodrigo', '(85) 9 9809-9000', '177', 'chileno', '15/10/1956', 'leo'),
(6, 'livia', 'livia.hotmail', '(00) 0 0000-0000', '1333', 'uruguana', '15/10/1990', '133livia'),
(7, 'luana', 'luana.gmail.com', '(00) 0 0000-0000', '145', 'brazil', '18/10/1980', 'lulu');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `boletos`
--
ALTER TABLE `boletos`
  ADD PRIMARY KEY (`idboleto`);

--
-- Índices para tabela `cadastro`
--
ALTER TABLE `cadastro`
  ADD PRIMARY KEY (`iduzer`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `boletos`
--
ALTER TABLE `boletos`
  MODIFY `idboleto` int(45) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cadastro`
--
ALTER TABLE `cadastro`
  MODIFY `iduzer` int(45) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
