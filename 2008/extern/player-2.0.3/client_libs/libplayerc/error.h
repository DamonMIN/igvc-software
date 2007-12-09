/*
 *  Player - One Hell of a Robot Server
 *  Copyright (C) Andrew Howard 2002-2003
 *                      
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
/*
 *  Player - One Hell of a Robot Server
 *  Copyright (C) Andrew Howard 2003
 *                      
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

/***************************************************************************
 * Desc: Player client lib; stuff used internally.
 * Author: Andrew Howard
 * Date: 13 May 2002
 * CVS: $Id: error.h,v 1.11 2005/10/27 02:45:27 thjc Exp $
 **************************************************************************/

#ifndef PLAYERC_PRIVATE_H
#define PLAYERC_PRIVATE_H

#include <stdio.h>

#define PLAYERC_ERROR_SIZE 1024
// Use this function to read the error string
const char *playerc_error_str(void);

// Use this function to set the error string
char *playerc_error_set_str(void);

// Useful error macros.
// These print out the error
/*#define PLAYERC_ERR(msg)         printf("playerc error   : " msg "\n")
#define PLAYERC_ERR1(msg, a)     printf("playerc error   : " msg "\n", a)
#define PLAYERC_ERR2(msg, a, b)  printf("playerc error   : " msg "\n", a, b)
#define PLAYERC_ERR3(msg, a, b, c)  printf("playerc error   : " msg "\n", a, b, c)
#define PLAYERC_ERR4(msg, a, b, c, d)  printf("playerc error   : " msg "\n", a, b, c, d)

#define PLAYERC_WARN(msg)        printf("playerc warning : " msg "\n")
#define PLAYERC_WARN1(msg, a)    printf("playerc warning : " msg "\n", a)
#define PLAYERC_WARN2(msg, a, b) printf("playerc warning : " msg "\n", a, b)
#define PLAYERC_WARN3(msg, a, b, c)  printf("playerc warning   : " msg "\n", a, b, c)
#define PLAYERC_WARN4(msg, a, b, c, d)  printf("playerc warning   : " msg "\n", a, b, c, d)

#define PLAYERC_MSG3(msg, a, b, c) printf("playerc message : " msg "\n", a, b, c)
*/
// Useful error macros.
// These ones store the error message.
#define PLAYERC_ERR(msg)         			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_ERR1(msg, a)     			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg, a), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_ERR2(msg, a, b)  			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg, a, b), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_ERR3(msg, a, b, c)  		snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg, a, b, c), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_ERR4(msg, a, b, c, d)  		snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg, a, b, c, d), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_ERR5(msg, a, b, c, d, e)  	snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, msg, a, b, c, d, e), printf("playerc error   : %s\n",playerc_error_str())
#define PLAYERC_WARN(msg)        			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg), printf("playerc warning   : %s\n",playerc_error_str())
#define PLAYERC_WARN1(msg, a)    			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg, a), printf("playerc warning   : %s\n",playerc_error_str())
#define PLAYERC_WARN2(msg, a, b) 			snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg, a, b), printf("playerc warning   : %s\n",playerc_error_str())
#define PLAYERC_WARN3(msg, a, b, c) 		snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg, a, b, c), printf("playerc warning   : %s\n",playerc_error_str())
#define PLAYERC_WARN4(msg, a, b, c, d) 		snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg, a, b, c, d), printf("playerc warning   : %s\n",playerc_error_str())
#define PLAYERC_WARN5(msg, a, b, c, d, e) 	snprintf(playerc_error_set_str(), PLAYERC_ERROR_SIZE, "warning : " msg, a, b, c, d, e), printf("playerc warning   : %s\n",playerc_error_str())


// DEBUG macros
#ifdef DEBUG
#define PRINT_DEBUG(m)         printf("\rlibplayerc debug : %s %s\n  "m"\n", \
                                     __FILE__, __FUNCTION__)
#define PRINT_DEBUG1(m, a)     printf("\rlibplayerc debug : %s %s\n  "m"\n", \
                                     __FILE__, __FUNCTION__, a)
#define PRINT_DEBUG2(m, a, b)  printf("\rlibplayerc debug : %s %s\n  "m"\n", \
                                     __FILE__, __FUNCTION__, a, b)
#define PRINT_DEBUG3(m, a, b, c) printf("\rlibplayerc debug : %s %s\n  "m"\n", \
                                     __FILE__, __FUNCTION__, a, b, c)
#else
#define PRINT_DEBUG(m)
#define PRINT_DEBUG1(m, a)
#define PRINT_DEBUG2(m, a, b)
#define PRINT_DEBUG3(m, a, b, c)
#endif

#endif
