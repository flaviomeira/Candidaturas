-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 20, 2015 at 02:08 
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `candidaturasdb`
--
CREATE DATABASE IF NOT EXISTS `candidaturasdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `candidaturasdb`;

-- --------------------------------------------------------

--
-- Table structure for table `despesas_2014`
--

CREATE TABLE IF NOT EXISTS `despesas_2014` (
  `cod_eleicao` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `desc_eleicao` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `data_hora` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `cnpj_prestador_conta` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `sequencial_candidato` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `uf` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `sigla_partido` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cargo` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_candidato` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `cpf_candidato` varchar(16) COLLATE latin1_bin DEFAULT NULL,
  `tipo_documento` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `numero_documento` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_fornecedor` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_fornecedor` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `nome_fornecedor_receita_federal` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `cod_setor_economico_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_do_fornecedor` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `data_despesa` varchar(24) COLLATE latin1_bin DEFAULT NULL,
  `valor_despesa` decimal(15,2) DEFAULT NULL,
  `tipo_despesa` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `descricao_despesa` varchar(255) COLLATE latin1_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

-- --------------------------------------------------------

--
-- Table structure for table `receitas_2012`
--

CREATE TABLE IF NOT EXISTS `receitas_2012` (
  `data_hora` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `sequencial_candidato` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `uf` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `numero_ue` varchar(25) COLLATE latin1_bin DEFAULT NULL,
  `municipio` varchar(100) COLLATE latin1_bin DEFAULT NULL,
  `sigla_partido` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cargo` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_candidato` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `cpf_candidato` varchar(16) COLLATE latin1_bin DEFAULT NULL,
  `numero_recibo_eleitoral` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `numero_documento` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `nome_receita_doador` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `sigla_ue_doador` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_partido_doador` varchar(12) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `cod_setor_economico_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_doador` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `data_receita` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `valor_receita` decimal(15,2) DEFAULT NULL,
  `tipo_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `fonte_recurso` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `especie_recurso` varchar(100) COLLATE latin1_bin DEFAULT NULL,
  `descricao_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

-- --------------------------------------------------------

--
-- Table structure for table `receitas_rn`
--

CREATE TABLE IF NOT EXISTS `receitas_rn` (
  `cod_eleicao` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `desc_eleicao` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `data_hora` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `cnpj_prestador_conta` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `sequencial_candidato` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `uf` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `sigla_partido` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cargo` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_candidato` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `cpf_candidato` varchar(16) COLLATE latin1_bin DEFAULT NULL,
  `numero_recibo_eleitoral` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `numero_documento` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_receita_federal` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `sigla_ue_doador` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `numero_partido_doador` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato_doador` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cod_setor_economico_doador` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_doador` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `data_receita` varchar(24) COLLATE latin1_bin DEFAULT NULL,
  `valor_receita` decimal(15,2) DEFAULT NULL,
  `tipo_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `fonte_recurso` int(255) DEFAULT NULL,
  `especie_recurso` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `descricao_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_doador_originario` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_originario` varchar(100) COLLATE latin1_bin DEFAULT NULL,
  `tipo_doador_originario` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_doador_originario` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_originario_receita_federal` varchar(150) COLLATE latin1_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

-- --------------------------------------------------------

--
-- Table structure for table `receitas_sp`
--

CREATE TABLE IF NOT EXISTS `receitas_sp` (
  `cod_eleicao` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `desc_eleicao` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `data_hora` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `cnpj_prestador_conta` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `sequencial_candidato` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `uf` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `sigla_partido` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cargo` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_candidato` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `cpf_candidato` varchar(16) COLLATE latin1_bin DEFAULT NULL,
  `numero_recibo_eleitoral` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `numero_documento` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_doador` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_receita_federal` varchar(200) COLLATE latin1_bin DEFAULT NULL,
  `sigla_ue_doador` varchar(5) COLLATE latin1_bin DEFAULT NULL,
  `numero_partido_doador` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `numero_candidato_doador` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `cod_setor_economico_doador` varchar(30) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_doador` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `data_receita` varchar(24) COLLATE latin1_bin DEFAULT NULL,
  `valor_receita` decimal(15,2) DEFAULT NULL,
  `tipo_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `fonte_recurso` int(255) DEFAULT NULL,
  `especie_recurso` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `descricao_receita` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `cpf_cnpj_doador_originario` varchar(20) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_originario` varchar(100) COLLATE latin1_bin DEFAULT NULL,
  `tipo_doador_originario` varchar(10) COLLATE latin1_bin DEFAULT NULL,
  `setor_economico_doador_originario` varchar(50) COLLATE latin1_bin DEFAULT NULL,
  `nome_doador_originario_receita_federal` varchar(150) COLLATE latin1_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;
