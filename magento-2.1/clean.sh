#!/bin/bash

rm -fr var/cache/*
rm -fr var/page_cache/*
rm -fr var/generation/*
rm -fr var/view_processed/*
rm -fr pub/static/*

#bin/magento setup:di:compile
#bin/magento setup:upgrade
bin/magento cache:clean
bin/magento cache:flush
#bin/magento setup:static-content:deploy