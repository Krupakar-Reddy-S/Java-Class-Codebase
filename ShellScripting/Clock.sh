#! /bin/bash

while :; do
  printf -v start_day '%(%a %b %e %Y)T'
  day=$start_day

  clear
  echo "$day"
  while sleep 1 && [[ $start_day = $day ]]; do
      printf -v day '%(%a %b %e %Y)T'
      printf '\r%(%H:%M:%S %p)T'
  done
done